package me.localx.icons.straight.bold

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

public val Icons.Bold.ShieldTrust: ImageVector
    get() {
        if (_shieldTrust != null) {
            return _shieldTrust!!
        }
        _shieldTrust = Builder(name = "ShieldTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.547f, 13.26f)
                lineTo(20.943f, 3.935f)
                lineToRelative(2.113f, 2.13f)
                lineToRelative(-9.808f, 9.732f)
                curveToRelative(-0.447f, 0.45f, -1.053f, 0.702f, -1.697f, 0.703f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.645f, 0.0f, -1.25f, -0.252f, -1.706f, -0.708f)
                lineToRelative(-3.337f, -3.279f)
                lineToRelative(2.102f, -2.14f)
                lineToRelative(2.938f, 2.887f)
                close()
                moveTo(21.949f, 9.982f)
                lineToRelative(-3.949f, 3.918f)
                verticalLineToRelative(4.1f)
                horizontalLineToRelative(-4.275f)
                lineToRelative(-1.725f, 1.725f)
                lineToRelative(-1.725f, -1.725f)
                horizontalLineToRelative(-4.275f)
                verticalLineToRelative(-4.275f)
                lineToRelative(-1.725f, -1.725f)
                lineToRelative(1.725f, -1.725f)
                verticalLineToRelative(-4.275f)
                horizontalLineToRelative(4.275f)
                lineToRelative(1.725f, -1.725f)
                lineToRelative(1.725f, 1.725f)
                horizontalLineToRelative(2.299f)
                lineToRelative(3.023f, -3.0f)
                horizontalLineToRelative(-4.079f)
                lineTo(12.0f, 0.032f)
                lineToRelative(-2.967f, 2.968f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(6.033f)
                lineTo(0.033f, 12.0f)
                lineToRelative(2.967f, 2.967f)
                verticalLineToRelative(6.033f)
                horizontalLineToRelative(6.033f)
                lineToRelative(2.967f, 2.967f)
                lineToRelative(2.967f, -2.967f)
                horizontalLineToRelative(6.033f)
                verticalLineToRelative(-6.033f)
                lineToRelative(2.967f, -2.967f)
                lineToRelative(-2.018f, -2.018f)
                close()
            }
        }
        .build()
        return _shieldTrust!!
    }

private var _shieldTrust: ImageVector? = null
