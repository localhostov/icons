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

public val Icons.Outline.PersonDollyEmpty: ImageVector
    get() {
        if (_personDollyEmpty != null) {
            return _personDollyEmpty!!
        }
        _personDollyEmpty = Builder(name = "PersonDollyEmpty", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 2.5f)
                curveTo(1.0f, 1.119f, 2.119f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.0f, 3.881f, 1.0f, 2.5f)
                close()
                moveTo(23.975f, 18.044f)
                curveToRelative(-0.125f, -0.538f, -0.66f, -0.87f, -1.2f, -0.749f)
                lineToRelative(-7.795f, 1.804f)
                lineToRelative(-3.004f, -13.318f)
                curveToRelative(-0.122f, -0.539f, -0.654f, -0.878f, -1.196f, -0.756f)
                curveToRelative(-0.539f, 0.122f, -0.877f, 0.657f, -0.755f, 1.195f)
                lineToRelative(1.078f, 4.78f)
                horizontalLineToRelative(-2.485f)
                lineToRelative(-1.37f, -2.739f)
                curveToRelative(-0.697f, -1.395f, -2.099f, -2.261f, -3.658f, -2.261f)
                curveToRelative(-1.979f, 0.0f, -3.59f, 1.61f, -3.59f, 3.604f)
                lineToRelative(0.053f, 3.78f)
                curveToRelative(0.02f, 1.393f, 0.744f, 2.653f, 1.938f, 3.371f)
                lineToRelative(2.524f, 1.52f)
                curveToRelative(0.299f, 0.179f, 0.484f, 0.508f, 0.484f, 0.856f)
                verticalLineToRelative(3.869f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.869f)
                curveToRelative(0.0f, -1.047f, -0.557f, -2.032f, -1.454f, -2.57f)
                lineToRelative(-2.524f, -1.519f)
                curveToRelative(-0.597f, -0.359f, -0.959f, -0.99f, -0.969f, -1.686f)
                lineToRelative(-0.053f, -3.767f)
                curveToRelative(0.0f, -0.877f, 0.713f, -1.59f, 1.59f, -1.59f)
                curveToRelative(0.14f, 0.0f, 0.277f, 0.014f, 0.41f, 0.04f)
                verticalLineToRelative(4.96f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.764f)
                lineToRelative(0.829f, 1.658f)
                curveToRelative(0.341f, 0.682f, 1.026f, 1.105f, 1.789f, 1.105f)
                horizontalLineToRelative(2.936f)
                lineToRelative(1.369f, 6.068f)
                curveToRelative(-1.102f, 0.261f, -1.923f, 1.25f, -1.923f, 2.432f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.196f, -0.023f, -0.386f, -0.066f, -0.569f)
                lineToRelative(7.291f, -1.687f)
                curveToRelative(0.538f, -0.125f, 0.873f, -0.662f, 0.749f, -1.2f)
                close()
                moveTo(2.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _personDollyEmpty!!
    }

private var _personDollyEmpty: ImageVector? = null
