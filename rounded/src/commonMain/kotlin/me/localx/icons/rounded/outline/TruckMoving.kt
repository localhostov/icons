package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.TruckMoving: ImageVector
    get() {
        if (_truckMoving != null) {
            return _truckMoving!!
        }
        _truckMoving = Builder(name = "TruckMoving", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.641f, 10.76f)
                lineTo(22.632f, 7.735f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 18.838f, 5.0f)
                lineTo(16.9f, 5.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 12.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 6.0f)
                lineTo(0.0f, 19.5f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 6.0f, 2.447f)
                arcTo(3.517f, 3.517f, 0.0f, false, false, 12.0f, 19.5f)
                lineTo(12.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(22.0f, 18.463f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 15.0f)
                lineTo(24.0f, 12.974f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 23.641f, 10.76f)
                close()
                moveTo(20.735f, 8.368f)
                lineTo(21.612f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(1.838f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.735f, 8.368f)
                close()
                moveTo(2.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(15.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                close()
                moveTo(3.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 19.5f)
                lineTo(2.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 21.0f)
                close()
                moveTo(10.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(17.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _truckMoving!!
    }

private var _truckMoving: ImageVector? = null
