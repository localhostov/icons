package me.localx.icons.straight.outline

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

public val Icons.Outline.GrinTongueWink: ImageVector
    get() {
        if (_grinTongueWink != null) {
            return _grinTongueWink!!
        }
        _grinTongueWink = Builder(name = "GrinTongueWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(15.0f, 16.0f)
                verticalLineToRelative(0.6f)
                arcTo(3.237f, 3.237f, 0.0f, false, true, 12.0f, 20.0f)
                arcToRelative(3.237f, 3.237f, 0.0f, false, true, -3.0f, -3.4f)
                lineTo(9.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.0f, 0.662f, 0.411f, 1.4f, 1.0f, 1.4f)
                reflectiveCurveToRelative(1.0f, -0.738f, 1.0f, -1.4f)
                close()
            }
        }
        .build()
        return _grinTongueWink!!
    }

private var _grinTongueWink: ImageVector? = null
