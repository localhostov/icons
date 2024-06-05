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

public val Icons.Outline.Stomach: ImageVector
    get() {
        if (_stomach != null) {
            return _stomach!!
        }
        _stomach = Builder(name = "Stomach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.398f, 0.0f, -2.701f, -0.967f, -3.031f, -2.249f)
                curveToRelative(-0.138f, -0.535f, -0.687f, -0.854f, -1.218f, -0.72f)
                curveToRelative(-0.535f, 0.138f, -0.857f, 0.684f, -0.72f, 1.218f)
                curveToRelative(0.478f, 1.855f, 2.07f, 3.276f, 3.969f, 3.652f)
                verticalLineToRelative(9.099f)
                curveToRelative(0.0f, 2.176f, -3.59f, 3.173f, -3.717f, 3.304f)
                curveToRelative(-1.914f, 0.702f, -3.283f, 2.542f, -3.283f, 4.696f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                curveToRelative(0.174f, 0.108f, 0.344f, 0.216f, 0.511f, 0.322f)
                curveToRelative(2.012f, 1.275f, 3.911f, 2.479f, 8.487f, 2.505f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.835f, 0.0f, 3.568f, -0.72f, 4.886f, -2.029f)
                curveToRelative(1.338f, -1.331f, 2.075f, -3.096f, 2.075f, -4.97f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(15.0f, 5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.314f)
                curveToRelative(-0.539f, -0.181f, -1.205f, -0.314f, -2.0f, -0.314f)
                curveToRelative(-1.185f, 0.0f, -1.971f, 0.301f, -2.664f, 0.566f)
                curveToRelative(-0.608f, 0.232f, -1.134f, 0.434f, -1.949f, 0.434f)
                curveToRelative(-1.049f, 0.0f, -1.906f, -0.335f, -2.387f, -0.575f)
                verticalLineToRelative(-6.425f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(18.515f, 18.552f)
                curveToRelative(-0.939f, 0.934f, -2.173f, 1.447f, -3.477f, 1.447f)
                horizontalLineToRelative(-0.027f)
                curveToRelative(-3.58f, -0.021f, -5.167f, -0.789f, -6.832f, -1.818f)
                curveToRelative(1.318f, -0.731f, 2.821f, -2.035f, 2.821f, -4.181f)
                verticalLineToRelative(-0.41f)
                curveToRelative(0.646f, 0.225f, 1.46f, 0.41f, 2.387f, 0.41f)
                curveToRelative(1.185f, 0.0f, 1.971f, -0.301f, 2.664f, -0.566f)
                curveToRelative(0.608f, -0.232f, 1.134f, -0.434f, 1.949f, -0.434f)
                curveToRelative(0.986f, 0.0f, 1.65f, 0.291f, 2.0f, 0.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.338f, -0.527f, 2.599f, -1.485f, 3.552f)
                close()
            }
        }
        .build()
        return _stomach!!
    }

private var _stomach: ImageVector? = null
