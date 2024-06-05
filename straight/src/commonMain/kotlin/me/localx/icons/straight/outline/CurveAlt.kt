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

public val Icons.Outline.CurveAlt: ImageVector
    get() {
        if (_curveAlt != null) {
            return _curveAlt!!
        }
        _curveAlt = Builder(name = "CurveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(5.588f, 0.0f, 10.32f, -4.35f, 11.007f, -10.118f)
                curveTo(11.813f, 5.108f, 17.399f, 0.0f, 24.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-5.588f, 0.0f, -10.32f, 4.35f, -11.007f, 10.118f)
                curveToRelative(-0.807f, 6.773f, -6.393f, 11.882f, -12.993f, 11.882f)
                close()
            }
        }
        .build()
        return _curveAlt!!
    }

private var _curveAlt: ImageVector? = null
