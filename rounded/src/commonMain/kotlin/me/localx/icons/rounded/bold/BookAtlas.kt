package me.localx.icons.rounded.bold

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

public val Icons.Bold.BookAtlas: ImageVector
    get() {
        if (_bookAtlas != null) {
            return _bookAtlas!!
        }
        _bookAtlas = Builder(name = "BookAtlas", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(3.468f, 0.0f, 1.0f, 2.468f, 1.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(6.5f, 3.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                lineTo(20.0f, 15.0f)
                lineTo(5.5f, 15.0f)
                curveToRelative(-0.526f, 0.0f, -1.031f, 0.091f, -1.5f, 0.257f)
                lineTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(6.0f, 9.0f)
                curveToRelative(0.0f, -2.001f, 0.98f, -3.773f, 2.485f, -4.863f)
                curveToRelative(0.455f, -0.329f, 1.095f, 0.089f, 0.967f, 0.637f)
                curveToRelative(-0.224f, 0.959f, -0.374f, 2.053f, -0.429f, 3.226f)
                horizontalLineToRelative(1.993f)
                curveToRelative(0.086f, -2.554f, 0.494f, -4.487f, 0.983f, -4.487f)
                reflectiveCurveToRelative(0.897f, 1.933f, 0.983f, 4.487f)
                horizontalLineToRelative(1.993f)
                curveToRelative(-0.055f, -1.173f, -0.205f, -2.268f, -0.429f, -3.226f)
                curveToRelative(-0.128f, -0.547f, 0.512f, -0.966f, 0.967f, -0.637f)
                curveToRelative(1.506f, 1.09f, 2.485f, 2.862f, 2.485f, 4.863f)
                reflectiveCurveToRelative(-0.98f, 3.773f, -2.485f, 4.863f)
                curveToRelative(-0.455f, 0.329f, -1.095f, -0.09f, -0.967f, -0.637f)
                curveToRelative(0.224f, -0.958f, 0.374f, -2.053f, 0.429f, -3.226f)
                horizontalLineToRelative(-1.992f)
                curveToRelative(-0.085f, 2.566f, -0.493f, 4.513f, -0.984f, 4.513f)
                reflectiveCurveToRelative(-0.899f, -1.946f, -0.984f, -4.513f)
                horizontalLineToRelative(-1.992f)
                curveToRelative(0.055f, 1.173f, 0.205f, 2.268f, 0.429f, 3.226f)
                curveToRelative(0.128f, 0.547f, -0.512f, 0.966f, -0.967f, 0.637f)
                curveToRelative(-1.506f, -1.09f, -2.485f, -2.862f, -2.485f, -4.863f)
                close()
            }
        }
        .build()
        return _bookAtlas!!
    }

private var _bookAtlas: ImageVector? = null
