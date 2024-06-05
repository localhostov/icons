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

public val Icons.Bold.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.571f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineTo(17.985f, 0.0f)
                lineTo(19.4f, 1.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, 2.828f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, -3.414f)
                lineTo(12.0f, 0.0f)
                lineTo(10.586f, 1.586f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(5.985f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.4f, 1.586f)
                lineTo(5.985f, 0.0f)
                lineTo(4.571f, 1.586f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.985f, 5.0f)
                close()
                moveTo(23.0f, 18.267f)
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
                lineToRelative(1.861f, 3.853f)
                arcTo(12.58f, 12.58f, 0.0f, false, true, 23.0f, 18.267f)
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
        return _carWash!!
    }

private var _carWash: ImageVector? = null
