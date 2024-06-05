package me.localx.icons.rounded.outline

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

public val Icons.Outline.PersonDress: ImageVector
    get() {
        if (_personDress != null) {
            return _personDress!!
        }
        _personDress = Builder(name = "PersonDress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.686f, 13.728f)
                curveToRelative(-0.193f, 0.182f, -0.439f, 0.272f, -0.686f, 0.272f)
                curveToRelative(-0.266f, 0.0f, -0.531f, -0.105f, -0.728f, -0.314f)
                lineToRelative(-1.918f, -2.036f)
                lineToRelative(0.622f, 4.978f)
                curveToRelative(0.107f, 0.854f, -0.158f, 1.712f, -0.728f, 2.357f)
                curveToRelative(-0.34f, 0.385f, -0.775f, 0.658f, -1.249f, 0.826f)
                verticalLineToRelative(3.188f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.188f)
                curveToRelative(-0.474f, -0.169f, -0.909f, -0.441f, -1.249f, -0.826f)
                curveToRelative(-0.569f, -0.645f, -0.834f, -1.504f, -0.728f, -2.357f)
                lineToRelative(0.621f, -4.964f)
                lineToRelative(-1.918f, 2.024f)
                curveToRelative(-0.197f, 0.208f, -0.461f, 0.312f, -0.726f, 0.312f)
                curveToRelative(-0.247f, 0.0f, -0.495f, -0.091f, -0.688f, -0.274f)
                curveToRelative(-0.401f, -0.38f, -0.418f, -1.013f, -0.038f, -1.414f)
                lineToRelative(4.471f, -4.719f)
                curveToRelative(0.762f, -0.973f, 1.944f, -1.593f, 3.255f, -1.593f)
                curveToRelative(1.166f, 0.0f, 2.221f, 0.501f, 2.979f, 1.294f)
                curveToRelative(0.019f, 0.017f, 4.749f, 5.02f, 4.749f, 5.02f)
                curveToRelative(0.378f, 0.402f, 0.36f, 1.035f, -0.042f, 1.414f)
                close()
                moveTo(10.285f, 8.877f)
                curveToRelative(-0.209f, 0.285f, -0.354f, 0.62f, -0.401f, 0.991f)
                lineToRelative(-0.876f, 7.008f)
                curveToRelative(-0.036f, 0.289f, 0.05f, 0.568f, 0.243f, 0.786f)
                curveToRelative(0.192f, 0.218f, 0.458f, 0.338f, 0.75f, 0.338f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.291f, 0.0f, 0.557f, -0.12f, 0.75f, -0.338f)
                curveToRelative(0.193f, -0.218f, 0.279f, -0.497f, 0.243f, -0.786f)
                lineToRelative(-0.876f, -7.008f)
                curveToRelative(-0.133f, -1.065f, -1.043f, -1.868f, -2.116f, -1.868f)
                curveToRelative(-0.509f, 0.0f, -0.977f, 0.185f, -1.347f, 0.488f)
                lineToRelative(-0.368f, 0.389f)
                close()
            }
        }
        .build()
        return _personDress!!
    }

private var _personDress: ImageVector? = null
