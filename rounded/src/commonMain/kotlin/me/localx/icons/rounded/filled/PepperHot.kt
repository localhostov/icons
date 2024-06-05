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

public val Icons.Filled.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                curveToRelative(0.323f, 6.893f, -5.045f, 12.9f, -11.775f, 13.0f)
                curveTo(5.13f, 23.987f, -0.187f, 18.489f, 0.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.905f, 3.936f, 3.923f, 4.0f, 4.515f, 4.0f)
                curveToRelative(2.0f, 0.0f, 3.466f, -1.662f, 3.485f, -3.952f)
                arcToRelative(6.143f, 6.143f, 0.0f, false, true, 1.234f, -3.615f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, false, 9.548f, -0.052f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(9.0f, 6.692f)
                arcTo(1.019f, 1.019f, 0.0f, true, false, 11.0f, 7.0f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 9.707f, 3.571f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 9.0f, 1.864f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 1.0f)
                verticalLineToRelative(0.864f)
                arcTo(4.386f, 4.386f, 0.0f, false, false, 8.293f, 4.986f)
                arcTo(2.394f, 2.394f, 0.0f, false, true, 9.0f, 6.692f)
                close()
                moveTo(14.0f, 2.0f)
                curveToRelative(1.169f, 0.0f, 2.684f, 0.351f, 2.954f, 3.1f)
                arcToRelative(5.81f, 5.81f, 0.0f, false, false, -1.935f, 0.713f)
                curveToRelative(-0.159f, 4.216f, 6.139f, 4.2f, 5.961f, -0.011f)
                arcToRelative(6.064f, 6.064f, 0.0f, false, false, -2.015f, -0.7f)
                curveTo(18.622f, 0.688f, 15.753f, 0.0f, 14.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 2.0f)
                close()
                moveTo(4.294f, 6.293f)
                arcTo(2.434f, 2.434f, 0.0f, false, true, 5.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 9.0f)
                curveToRelative(2.0f, -0.29f, 0.622f, -3.264f, -0.293f, -4.121f)
                arcTo(2.463f, 2.463f, 0.0f, false, true, 5.0f, 2.994f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.012f)
                arcTo(4.423f, 4.423f, 0.0f, false, false, 4.294f, 6.293f)
                close()
                moveTo(12.225f, 24.0f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
