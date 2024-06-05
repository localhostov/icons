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

public val Icons.Outline.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.819f, 4.395f)
                lineToRelative(1.188f, -2.52f)
                lineTo(21.346f, 0.03f)
                lineToRelative(-0.898f, 0.749f)
                curveToRelative(-0.945f, 0.787f, -2.143f, 1.221f, -3.373f, 1.221f)
                lineTo(6.925f, 2.0f)
                curveToRelative(-1.23f, 0.0f, -2.428f, -0.434f, -3.373f, -1.221f)
                lineTo(2.651f, 0.028f)
                lineTo(-0.006f, 1.876f)
                lineToRelative(1.173f, 2.486f)
                curveToRelative(0.624f, 1.455f, 1.615f, 2.626f, 2.833f, 3.429f)
                verticalLineToRelative(3.209f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.206f)
                curveToRelative(1.216f, -0.799f, 2.203f, -1.961f, 2.819f, -3.399f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.293f)
                curveToRelative(0.653f, 0.187f, 1.338f, 0.293f, 2.046f, 0.293f)
                horizontalLineToRelative(2.954f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.954f)
                curveToRelative(0.709f, 0.0f, 1.393f, -0.106f, 2.046f, -0.293f)
                verticalLineToRelative(2.293f)
                close()
                moveTo(15.954f, 7.0f)
                horizontalLineToRelative(-7.907f)
                curveToRelative(-2.204f, 0.0f, -4.136f, -1.312f, -5.056f, -3.458f)
                lineToRelative(-0.466f, -0.989f)
                lineToRelative(0.024f, -0.018f)
                curveToRelative(1.257f, 0.947f, 2.797f, 1.465f, 4.376f, 1.465f)
                horizontalLineToRelative(10.15f)
                curveToRelative(1.578f, 0.0f, 3.118f, -0.518f, 4.375f, -1.464f)
                lineToRelative(0.026f, 0.018f)
                lineToRelative(-0.48f, 1.021f)
                curveToRelative(-0.906f, 2.113f, -2.837f, 3.426f, -5.042f, 3.426f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
