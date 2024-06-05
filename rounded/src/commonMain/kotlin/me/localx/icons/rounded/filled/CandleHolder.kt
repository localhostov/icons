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

public val Icons.Filled.CandleHolder: ImageVector
    get() {
        if (_candleHolder != null) {
            return _candleHolder!!
        }
        _candleHolder = Builder(name = "CandleHolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 16.0f)
                curveToRelative(-0.986f, 0.0f, -1.933f, 0.362f, -2.667f, 1.019f)
                curveToRelative(-0.412f, 0.368f, -0.446f, 1.0f, -0.078f, 1.412f)
                curveToRelative(0.369f, 0.411f, 1.0f, 0.447f, 1.412f, 0.078f)
                curveToRelative(0.367f, -0.329f, 0.84f, -0.509f, 1.333f, -0.509f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(5.709f, 3.709f)
                curveToRelative(0.0f, -0.731f, 0.766f, -2.148f, 1.412f, -3.214f)
                curveToRelative(0.4f, -0.66f, 1.358f, -0.66f, 1.758f, 0.0f)
                curveToRelative(0.646f, 1.065f, 1.412f, 2.482f, 1.412f, 3.214f)
                curveToRelative(0.0f, 1.265f, -1.026f, 2.291f, -2.291f, 2.291f)
                reflectiveCurveToRelative(-2.291f, -1.026f, -2.291f, -2.291f)
                close()
            }
        }
        .build()
        return _candleHolder!!
    }

private var _candleHolder: ImageVector? = null
