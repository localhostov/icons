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

public val Icons.Filled.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                curveToRelative(-82.436f, -0.094f, -149.239f, -66.898f, -149.333f, -149.333f)
                verticalLineToRelative(-192.0f)
                curveToRelative(0.0f, -4.267f, 0.277f, -8.533f, 0.64f, -12.629f)
                curveTo(68.139f, 110.864f, 42.731f, 149.371f, 42.667f, 192.0f)
                verticalLineToRelative(213.333f)
                curveTo(42.737f, 464.214f, 90.452f, 511.93f, 149.333f, 512.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(42.629f, -0.064f, 81.136f, -25.473f, 97.963f, -64.64f)
                curveToRelative(-4.267f, 0.363f, -8.363f, 0.64f, -12.629f, 0.64f)
                horizontalLineTo(256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(451.307f, 69.803f)
                lineToRelative(-48.725f, -50.325f)
                curveTo(397.217f, 14.045f, 390.924f, 9.616f, 384.0f, 6.4f)
                verticalLineToRelative(78.933f)
                horizontalLineToRelative(78.08f)
                curveTo(459.281f, 79.65f, 455.65f, 74.415f, 451.307f, 69.803f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.667f, 85.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(84.608f)
                curveToRelative(-1.571f, -13.852f, -7.65f, -26.805f, -17.301f, -36.864f)
                lineToRelative(-48.725f, -50.325f)
                curveToRelative(-10.659f, -10.804f, -24.8f, -17.485f, -39.915f, -18.859f)
                verticalLineTo(85.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 85.333f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-58.881f, 0.071f, -106.596f, 47.786f, -106.667f, 106.667f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.071f, 58.881f, 47.786f, 106.596f, 106.667f, 106.667f)
                horizontalLineToRelative(106.667f)
                curveToRelative(58.881f, -0.071f, 106.596f, -47.786f, 106.667f, -106.667f)
                verticalLineTo(149.333f)
                horizontalLineTo(384.0f)
                curveTo(348.654f, 149.333f, 320.0f, 120.68f, 320.0f, 85.333f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
