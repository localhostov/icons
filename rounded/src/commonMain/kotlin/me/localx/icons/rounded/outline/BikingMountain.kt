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
                moveTo(10.364f, 11.277f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, true, -0.051f, -1.457f)
                curveToRelative(0.169f, -0.16f, 2.653f, -2.44f, 2.653f, -2.44f)
                lineToRelative(3.327f, 3.327f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.961f, 0.961f, 0.0f, false, false, -0.124f, -0.107f)
                arcTo(6.454f, 6.454f, 0.0f, false, false, 9.923f, 4.0f)
                curveTo(8.521f, 4.0f, 5.0f, 5.19f, 5.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                curveToRelative(0.024f, 0.0f, 0.046f, -0.005f, 0.069f, -0.006f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 0.993f, 1.8f)
                lineTo(11.0f, 14.459f)
                lineTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.349f, -0.759f)
                close()
                moveTo(7.0f, 8.0f)
                curveTo(7.0f, 6.786f, 9.172f, 6.0f, 9.923f, 6.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, true, 1.339f, 0.227f)
                reflectiveCurveTo(8.946f, 8.361f, 8.919f, 8.387f)
                curveTo(8.538f, 8.749f, 8.225f, 9.0f, 8.0f, 9.0f)
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
