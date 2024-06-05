package me.localx.icons.rounded.filled

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

public val Icons.Filled.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                curveToRelative(1.753f, 0.0f, 4.622f, 0.689f, 4.965f, 5.1f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, 2.015f, 0.7f)
                curveToRelative(0.177f, 4.216f, -6.121f, 4.226f, -5.961f, 0.012f)
                arcTo(5.812f, 5.812f, 0.0f, false, true, 16.954f, 5.1f)
                curveTo(16.684f, 2.35f, 15.169f, 2.0f, 14.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 1.0f)
                close()
                moveTo(22.782f, 7.38f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, true, -9.548f, 0.052f)
                arcTo(6.148f, 6.148f, 0.0f, false, false, 12.0f, 11.048f)
                curveTo(11.981f, 13.338f, 10.516f, 15.0f, 8.515f, 15.0f)
                curveToRelative(-0.592f, 0.0f, -3.61f, -0.064f, -4.515f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                curveToRelative(-0.189f, 7.487f, 5.132f, 12.99f, 12.225f, 13.0f)
                arcTo(12.248f, 12.248f, 0.0f, false, false, 24.0f, 11.635f)
                arcTo(6.331f, 6.331f, 0.0f, false, false, 22.782f, 7.38f)
                close()
                moveTo(12.225f, 24.0f)
                curveToRelative(-0.077f, 0.0f, 0.075f, 0.0f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
