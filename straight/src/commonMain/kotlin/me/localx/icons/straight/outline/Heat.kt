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

public val Icons.Outline.Heat: ImageVector
    get() {
        if (_heat != null) {
            return _heat!!
        }
        _heat = Builder(name = "Heat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.981f, 24.005f)
                lineToRelative(-1.933f, -0.51f)
                curveToRelative(0.116f, -0.441f, 0.247f, -0.851f, 0.376f, -1.255f)
                arcToRelative(9.283f, 9.283f, 0.0f, false, false, 0.591f, -3.045f)
                arcToRelative(11.234f, 11.234f, 0.0f, false, false, -1.856f, -6.08f)
                arcTo(13.277f, 13.277f, 0.0f, false, true, 16.015f, 6.0f)
                arcTo(17.509f, 17.509f, 0.0f, false, true, 17.351f, 0.094f)
                lineToRelative(1.828f, 0.812f)
                arcTo(15.579f, 15.579f, 0.0f, false, false, 18.015f, 6.0f)
                arcToRelative(11.231f, 11.231f, 0.0f, false, false, 1.855f, 6.079f)
                arcTo(13.283f, 13.283f, 0.0f, false, true, 22.015f, 19.2f)
                arcToRelative(11.155f, 11.155f, 0.0f, false, true, -0.686f, 3.653f)
                curveTo(21.21f, 23.22f, 21.089f, 23.6f, 20.981f, 24.005f)
                close()
                moveTo(14.329f, 22.848f)
                arcToRelative(11.155f, 11.155f, 0.0f, false, false, 0.686f, -3.653f)
                arcToRelative(13.283f, 13.283f, 0.0f, false, false, -2.145f, -7.116f)
                arcTo(11.231f, 11.231f, 0.0f, false, true, 11.015f, 6.0f)
                arcTo(15.579f, 15.579f, 0.0f, false, true, 12.179f, 0.906f)
                lineTo(10.351f, 0.094f)
                arcTo(17.509f, 17.509f, 0.0f, false, false, 9.015f, 6.0f)
                arcToRelative(13.277f, 13.277f, 0.0f, false, false, 2.144f, 7.115f)
                arcToRelative(11.234f, 11.234f, 0.0f, false, true, 1.856f, 6.08f)
                arcToRelative(9.283f, 9.283f, 0.0f, false, true, -0.591f, 3.045f)
                curveToRelative(-0.129f, 0.4f, -0.26f, 0.814f, -0.376f, 1.255f)
                lineToRelative(1.933f, 0.51f)
                curveTo(14.089f, 23.6f, 14.21f, 23.22f, 14.329f, 22.848f)
                close()
                moveTo(7.329f, 22.848f)
                arcTo(11.155f, 11.155f, 0.0f, false, false, 8.015f, 19.2f)
                arcTo(13.283f, 13.283f, 0.0f, false, false, 5.87f, 12.079f)
                arcTo(11.231f, 11.231f, 0.0f, false, true, 4.015f, 6.0f)
                arcTo(15.579f, 15.579f, 0.0f, false, true, 5.179f, 0.906f)
                lineTo(3.351f, 0.094f)
                arcTo(17.509f, 17.509f, 0.0f, false, false, 2.015f, 6.0f)
                arcToRelative(13.277f, 13.277f, 0.0f, false, false, 2.144f, 7.115f)
                arcTo(11.234f, 11.234f, 0.0f, false, true, 6.015f, 19.2f)
                arcToRelative(9.283f, 9.283f, 0.0f, false, true, -0.591f, 3.045f)
                curveToRelative(-0.129f, 0.4f, -0.26f, 0.814f, -0.376f, 1.255f)
                lineToRelative(1.933f, 0.51f)
                curveTo(7.089f, 23.6f, 7.21f, 23.22f, 7.329f, 22.848f)
                close()
            }
        }
        .build()
        return _heat!!
    }

private var _heat: ImageVector? = null
