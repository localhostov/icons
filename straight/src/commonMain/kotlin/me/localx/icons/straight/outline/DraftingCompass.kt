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

public val Icons.Outline.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) {
            return _draftingCompass!!
        }
        _draftingCompass = Builder(name = "DraftingCompass", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.854f, 22.479f)
                lineToRelative(-4.541f, -7.431f)
                curveToRelative(1.092f, -0.628f, 2.12f, -1.408f, 3.052f, -2.34f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.818f, 0.818f, -1.722f, 1.499f, -2.682f, 2.046f)
                lineToRelative(-3.042f, -4.977f)
                curveToRelative(0.486f, -0.662f, 0.774f, -1.479f, 0.774f, -2.362f)
                curveToRelative(0.0f, -1.86f, -1.276f, -3.428f, -3.0f, -3.873f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.127f)
                curveToRelative(-1.724f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 0.883f, 0.288f, 1.699f, 0.774f, 2.362f)
                lineToRelative(-3.042f, 4.977f)
                curveToRelative(-0.96f, -0.547f, -1.864f, -1.228f, -2.682f, -2.046f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(0.932f, 0.932f, 1.96f, 1.712f, 3.052f, 2.34f)
                lineTo(0.146f, 22.479f)
                lineToRelative(1.707f, 1.043f)
                lineToRelative(4.642f, -7.595f)
                curveToRelative(1.761f, 0.711f, 3.633f, 1.066f, 5.505f, 1.066f)
                reflectiveCurveToRelative(3.744f, -0.355f, 5.505f, -1.066f)
                lineToRelative(4.642f, 7.595f)
                lineToRelative(1.707f, -1.043f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(7.555f, 14.192f)
                lineToRelative(2.783f, -4.554f)
                curveToRelative(0.506f, 0.232f, 1.069f, 0.362f, 1.662f, 0.362f)
                reflectiveCurveToRelative(1.156f, -0.13f, 1.662f, -0.362f)
                lineToRelative(2.783f, 4.554f)
                curveToRelative(-2.86f, 1.068f, -6.031f, 1.068f, -8.89f, 0.0f)
                close()
            }
        }
        .build()
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
