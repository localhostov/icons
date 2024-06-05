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

public val Icons.Filled.VectorCircle: ImageVector
    get() {
        if (_vectorCircle != null) {
            return _vectorCircle!!
        }
        _vectorCircle = Builder(name = "VectorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.037f, 9.004f)
                curveToRelative(-1.009f, -3.385f, -3.656f, -6.032f, -7.041f, -7.041f)
                curveToRelative(-0.02f, -1.086f, -0.906f, -1.963f, -1.996f, -1.963f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.09f, 0.0f, -1.976f, 0.877f, -1.996f, 1.963f)
                curveToRelative(-3.385f, 1.009f, -6.032f, 3.656f, -7.041f, 7.041f)
                curveToRelative(-1.086f, 0.02f, -1.963f, 0.906f, -1.963f, 1.996f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.09f, 0.877f, 1.976f, 1.963f, 1.996f)
                curveToRelative(1.009f, 3.385f, 3.656f, 6.032f, 7.041f, 7.041f)
                curveToRelative(0.02f, 1.086f, 0.906f, 1.963f, 1.996f, 1.963f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.09f, 0.0f, 1.976f, -0.877f, 1.996f, -1.963f)
                curveToRelative(3.385f, -1.009f, 6.032f, -3.656f, 7.041f, -7.041f)
                curveToRelative(1.086f, -0.02f, 1.963f, -0.906f, 1.963f, -1.996f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.09f, -0.877f, -1.976f, -1.963f, -1.996f)
                close()
                moveTo(14.995f, 19.957f)
                curveToRelative(-0.024f, -1.082f, -0.908f, -1.956f, -1.996f, -1.956f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.088f, 0.0f, -1.972f, 0.874f, -1.996f, 1.956f)
                curveToRelative(-2.287f, -0.86f, -4.101f, -2.673f, -4.961f, -4.961f)
                curveToRelative(1.082f, -0.024f, 1.956f, -0.908f, 1.956f, -1.996f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.088f, -0.874f, -1.972f, -1.956f, -1.996f)
                curveToRelative(0.86f, -2.287f, 2.673f, -4.101f, 4.961f, -4.961f)
                curveToRelative(0.024f, 1.082f, 0.908f, 1.956f, 1.996f, 1.956f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.088f, 0.0f, 1.972f, -0.874f, 1.996f, -1.956f)
                curveToRelative(2.287f, 0.86f, 4.101f, 2.673f, 4.961f, 4.961f)
                curveToRelative(-1.082f, 0.024f, -1.956f, 0.908f, -1.956f, 1.996f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.088f, 0.874f, 1.972f, 1.956f, 1.996f)
                curveToRelative(-0.86f, 2.287f, -2.673f, 4.101f, -4.961f, 4.961f)
                close()
            }
        }
        .build()
        return _vectorCircle!!
    }

private var _vectorCircle: ImageVector? = null
