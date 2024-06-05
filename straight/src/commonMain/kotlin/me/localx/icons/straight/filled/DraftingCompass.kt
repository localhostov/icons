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

public val Icons.Filled.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) {
            return _draftingCompass!!
        }
        _draftingCompass = Builder(name = "DraftingCompass", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.303f, 15.033f)
                curveToRelative(1.093f, -0.628f, 2.128f, -1.393f, 3.061f, -2.326f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.819f, 0.818f, -1.728f, 1.488f, -2.689f, 2.035f)
                lineToRelative(-3.041f, -4.977f)
                curveToRelative(0.485f, -0.662f, 0.78f, -1.47f, 0.78f, -2.351f)
                curveToRelative(0.0f, -1.858f, -1.279f, -3.411f, -3.0f, -3.858f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.142f)
                curveToRelative(-1.721f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                curveToRelative(0.0f, 0.881f, 0.295f, 1.689f, 0.78f, 2.351f)
                lineToRelative(-3.041f, 4.977f)
                curveToRelative(-0.961f, -0.547f, -1.87f, -1.216f, -2.689f, -2.035f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(0.933f, 0.933f, 1.968f, 1.698f, 3.061f, 2.326f)
                lineTo(0.146f, 22.479f)
                lineToRelative(1.707f, 1.043f)
                lineToRelative(4.642f, -7.596f)
                curveToRelative(1.761f, 0.711f, 3.633f, 1.066f, 5.505f, 1.066f)
                reflectiveCurveToRelative(3.744f, -0.356f, 5.505f, -1.066f)
                lineToRelative(4.642f, 7.596f)
                lineToRelative(1.707f, -1.043f)
                lineToRelative(-4.55f, -7.446f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(7.561f, 14.182f)
                lineToRelative(2.782f, -4.552f)
                curveToRelative(0.506f, 0.232f, 1.064f, 0.37f, 1.657f, 0.37f)
                reflectiveCurveToRelative(1.151f, -0.138f, 1.657f, -0.37f)
                lineToRelative(2.782f, 4.552f)
                curveToRelative(-2.858f, 1.066f, -6.02f, 1.066f, -8.878f, 0.0f)
                close()
            }
        }
        .build()
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
