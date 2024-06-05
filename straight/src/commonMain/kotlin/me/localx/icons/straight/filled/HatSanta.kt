package me.localx.icons.straight.filled

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

public val Icons.Filled.HatSanta: ImageVector
    get() {
        if (_hatSanta != null) {
            return _hatSanta!!
        }
        _hatSanta = Builder(name = "HatSanta", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.998f)
                verticalLineToRelative(3.002f)
                lineToRelative(-24.0f, 0.002f)
                verticalLineToRelative(-3.002f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.344f, 3.0f, 2.998f)
                close()
                moveTo(19.886f, 9.865f)
                curveToRelative(-2.223f, -0.508f, -3.886f, -2.488f, -3.886f, -4.865f)
                curveToRelative(0.0f, -0.4f, 0.06f, -0.784f, 0.149f, -1.157f)
                curveToRelative(0.351f, -0.843f, 0.797f, -1.528f, 1.351f, -1.343f)
                curveToRelative(0.584f, 0.194f, 0.885f, 0.382f, 1.178f, 0.622f)
                curveToRelative(-0.417f, 0.515f, -0.678f, 1.163f, -0.678f, 1.878f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.18f, 0.0f, -0.353f, 0.023f, -0.524f, 0.053f)
                curveToRelative(-1.187f, -1.032f, -2.951f, -2.053f, -5.333f, -2.053f)
                curveTo(11.116f, 0.0f, 4.323f, 4.395f, 2.297f, 16.0f)
                horizontalLineToRelative(19.337f)
                curveToRelative(-0.408f, -2.334f, -1.016f, -4.361f, -1.747f, -6.135f)
                close()
            }
        }
        .build()
        return _hatSanta!!
    }

private var _hatSanta: ImageVector? = null
