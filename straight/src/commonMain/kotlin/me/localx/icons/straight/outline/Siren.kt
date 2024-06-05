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

public val Icons.Outline.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.12f, 17.003f)
                lineToRelative(-1.299f, -13.499f)
                curveToRelative(-0.25f, -1.998f, -1.957f, -3.504f, -3.969f, -3.504f)
                horizontalLineToRelative(-7.703f)
                curveToRelative(-2.013f, 0.0f, -3.719f, 1.506f, -3.973f, 3.532f)
                lineToRelative(-1.296f, 13.471f)
                curveToRelative(-1.599f, 0.063f, -2.88f, 1.383f, -2.88f, 2.997f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.614f, -1.281f, -2.934f, -2.88f, -2.997f)
                close()
                moveTo(6.164f, 3.752f)
                curveToRelative(0.125f, -0.999f, 0.979f, -1.752f, 1.985f, -1.752f)
                horizontalLineToRelative(7.703f)
                curveToRelative(1.006f, 0.0f, 1.86f, 0.753f, 1.981f, 1.724f)
                lineToRelative(1.277f, 13.276f)
                lineTo(4.89f, 17.0f)
                lineToRelative(1.274f, -13.248f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.773f, 8.0f)
                horizontalLineToRelative(-2.009f)
                lineToRelative(0.385f, -4.0f)
                horizontalLineToRelative(3.851f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.034f)
                lineToRelative(-0.192f, 2.0f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
