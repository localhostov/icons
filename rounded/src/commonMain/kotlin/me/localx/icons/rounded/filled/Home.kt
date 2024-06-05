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

public val Icons.Filled.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 319.841f)
                curveToRelative(-35.346f, 0.0f, -64.0f, 28.654f, -64.0f, 64.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-128.0f)
                curveTo(320.0f, 348.495f, 291.346f, 319.841f, 256.0f, 319.841f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.667f, 383.841f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, -28.654f, 64.0f, -64.0f)
                verticalLineTo(253.26f)
                curveToRelative(0.005f, -11.083f, -4.302f, -21.733f, -12.011f, -29.696f)
                lineToRelative(-181.29f, -195.99f)
                curveToRelative(-31.988f, -34.61f, -85.976f, -36.735f, -120.586f, -4.747f)
                curveToRelative(-1.644f, 1.52f, -3.228f, 3.103f, -4.747f, 4.747f)
                lineTo(12.395f, 223.5f)
                curveTo(4.453f, 231.496f, -0.003f, 242.31f, 0.0f, 253.58f)
                verticalLineToRelative(194.261f)
                curveToRelative(0.0f, 35.346f, 28.654f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(85.333f)
                verticalLineToRelative(-128.0f)
                curveToRelative(0.399f, -58.172f, 47.366f, -105.676f, 104.073f, -107.044f)
                curveTo(312.01f, 275.383f, 362.22f, 323.696f, 362.667f, 383.841f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 319.841f)
                curveToRelative(-35.346f, 0.0f, -64.0f, 28.654f, -64.0f, 64.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-128.0f)
                curveTo(320.0f, 348.495f, 291.346f, 319.841f, 256.0f, 319.841f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
