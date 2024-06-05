package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CarGarage: ImageVector
    get() {
        if (_carGarage != null) {
            return _carGarage!!
        }
        _carGarage = Builder(name = "CarGarage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.35f, 7.954f)
                lineTo(0.073f, 5.239f)
                lineTo(10.513f, 0.333f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, 2.973f, 0.0f)
                lineTo(23.963f, 5.238f)
                lineTo(22.691f, 7.955f)
                lineTo(12.213f, 3.047f)
                arcToRelative(0.492f, 0.492f, 0.0f, false, false, -0.424f, 0.0f)
                close()
                moveTo(21.757f, 12.832f)
                arcTo(12.58f, 12.58f, 0.0f, false, true, 23.0f, 18.267f)
                lineTo(23.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                lineTo(1.0f, 18.267f)
                arcToRelative(12.58f, 12.58f, 0.0f, false, true, 1.243f, -5.435f)
                lineTo(4.1f, 8.979f)
                arcTo(3.517f, 3.517f, 0.0f, false, true, 7.255f, 7.0f)
                horizontalLineToRelative(9.49f)
                arcTo(3.517f, 3.517f, 0.0f, false, true, 19.9f, 8.979f)
                close()
                moveTo(5.5f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 17.5f)
                lineTo(4.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 19.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 17.5f)
                lineTo(7.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 16.0f)
                close()
                moveTo(18.507f, 13.0f)
                lineTo(17.2f, 10.283f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.45f, -0.283f)
                lineTo(7.255f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.45f, 0.283f)
                lineTo(5.493f, 13.0f)
                close()
                moveTo(18.5f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 17.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 19.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 17.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 16.0f)
                close()
            }
        }
        .build()
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
