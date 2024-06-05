package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.19f, viewportHeight = 512.19f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.095f, 256.095f)
                moveToRelative(-85.333f, 0.0f)
                arcToRelative(85.333f, 85.333f, 0.0f, true, true, 170.666f, 0.0f)
                arcToRelative(85.333f, 85.333f, 0.0f, true, true, -170.666f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.543f, 201.034f)
                curveTo(463.455f, 147.146f, 388.191f, 56.735f, 256.095f, 56.735f)
                reflectiveCurveTo(48.735f, 147.146f, 15.647f, 201.034f)
                curveToRelative(-20.862f, 33.743f, -20.862f, 76.379f, 0.0f, 110.123f)
                curveToRelative(33.088f, 53.888f, 108.352f, 144.299f, 240.448f, 144.299f)
                reflectiveCurveToRelative(207.36f, -90.411f, 240.448f, -144.299f)
                curveTo(517.405f, 277.413f, 517.405f, 234.777f, 496.543f, 201.034f)
                close()
                moveTo(256.095f, 384.095f)
                curveToRelative(-70.692f, 0.0f, -128.0f, -57.308f, -128.0f, -128.0f)
                reflectiveCurveToRelative(57.308f, -128.0f, 128.0f, -128.0f)
                reflectiveCurveToRelative(128.0f, 57.308f, 128.0f, 128.0f)
                curveTo(384.024f, 326.758f, 326.758f, 384.024f, 256.095f, 384.095f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
