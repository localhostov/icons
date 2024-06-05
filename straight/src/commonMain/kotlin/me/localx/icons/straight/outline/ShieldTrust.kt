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

public val Icons.Outline.ShieldTrust: ImageVector
    get() {
        if (_shieldTrust != null) {
            return _shieldTrust!!
        }
        _shieldTrust = Builder(name = "ShieldTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.021f, 12.0f)
                lineToRelative(-3.521f, 3.521f)
                verticalLineToRelative(4.979f)
                horizontalLineToRelative(-4.979f)
                lineToRelative(-3.521f, 3.521f)
                lineToRelative(-3.521f, -3.521f)
                lineTo(3.5f, 20.5f)
                verticalLineToRelative(-4.979f)
                lineTo(-0.021f, 12.0f)
                lineToRelative(3.521f, -3.521f)
                lineTo(3.5f, 3.5f)
                horizontalLineToRelative(4.979f)
                lineTo(12.0f, -0.021f)
                lineToRelative(3.521f, 3.521f)
                horizontalLineToRelative(3.733f)
                lineToRelative(-2.016f, 2.0f)
                horizontalLineToRelative(-2.545f)
                lineToRelative(-2.692f, -2.692f)
                lineToRelative(-2.692f, 2.692f)
                horizontalLineToRelative(-3.808f)
                verticalLineToRelative(3.808f)
                lineToRelative(-2.692f, 2.692f)
                lineToRelative(2.692f, 2.692f)
                verticalLineToRelative(3.808f)
                horizontalLineToRelative(3.808f)
                lineToRelative(2.692f, 2.692f)
                lineToRelative(2.692f, -2.692f)
                horizontalLineToRelative(3.808f)
                verticalLineToRelative(-3.808f)
                lineToRelative(2.692f, -2.692f)
                lineToRelative(-0.99f, -0.99f)
                lineToRelative(1.419f, -1.409f)
                lineToRelative(2.399f, 2.399f)
                close()
                moveTo(11.549f, 13.962f)
                lineToRelative(9.747f, -9.672f)
                lineToRelative(1.408f, 1.42f)
                lineToRelative(-9.808f, 9.732f)
                curveToRelative(-0.355f, 0.357f, -0.835f, 0.557f, -1.346f, 0.558f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.511f, 0.0f, -0.99f, -0.199f, -1.352f, -0.562f)
                lineToRelative(-3.899f, -3.84f)
                lineToRelative(1.402f, -1.425f)
                lineToRelative(3.848f, 3.789f)
                close()
                moveTo(11.606f, 14.018f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.003f, -0.002f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _shieldTrust!!
    }

private var _shieldTrust: ImageVector? = null
