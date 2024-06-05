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

public val Icons.Outline.BikingMountain: ImageVector
    get() {
        if (_bikingMountain != null) {
            return _bikingMountain!!
        }
        _bikingMountain = Builder(name = "BikingMountain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 5.0f, 13.0f)
                close()
                moveTo(5.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 21.0f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 13.0f)
                close()
                moveTo(19.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 21.0f)
                close()
                moveTo(10.017f, 10.534f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 0.3f, -0.716f)
                curveToRelative(0.168f, -0.16f, 2.656f, -2.443f, 2.656f, -2.443f)
                lineToRelative(4.4f, 4.337f)
                lineToRelative(1.4f, -1.424f)
                lineToRelative(-5.076f, -5.0f)
                lineToRelative(-0.083f, -0.074f)
                arcTo(6.436f, 6.436f, 0.0f, false, false, 9.923f, 4.0f)
                curveTo(8.521f, 4.0f, 5.0f, 5.19f, 5.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                curveToRelative(0.024f, 0.0f, 0.045f, -0.005f, 0.069f, -0.006f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, 0.993f, 1.8f)
                lineTo(11.0f, 14.459f)
                lineTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 13.541f)
                lineToRelative(-2.636f, -2.264f)
                arcTo(0.988f, 0.988f, 0.0f, false, true, 10.017f, 10.534f)
                close()
                moveTo(7.0f, 8.0f)
                curveTo(7.0f, 6.786f, 9.172f, 6.0f, 9.923f, 6.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, true, 1.339f, 0.227f)
                reflectiveCurveTo(8.948f, 8.359f, 8.921f, 8.385f)
                curveTo(8.539f, 8.748f, 8.225f, 9.0f, 8.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 8.0f)
                close()
                moveTo(14.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 2.5f)
                close()
            }
        }
        .build()
        return _bikingMountain!!
    }

private var _bikingMountain: ImageVector? = null
