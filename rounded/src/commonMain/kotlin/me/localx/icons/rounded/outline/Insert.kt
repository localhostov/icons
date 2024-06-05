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

public val Icons.Outline.Insert: ImageVector
    get() {
        if (_insert != null) {
            return _insert!!
        }
        _insert = Builder(name = "Insert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.3f, 13.214f)
                curveToRelative(-0.395f, -0.387f, -0.401f, -1.02f, -0.015f, -1.414f)
                curveToRelative(0.387f, -0.395f, 1.021f, -0.4f, 1.414f, -0.015f)
                lineToRelative(3.3f, 3.234f)
                lineTo(10.999f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.009f)
                lineToRelative(3.3f, -3.223f)
                curveToRelative(0.394f, -0.386f, 1.027f, -0.381f, 1.414f, 0.015f)
                curveToRelative(0.386f, 0.394f, 0.38f, 1.027f, -0.015f, 1.414f)
                lineToRelative(-4.293f, 4.207f)
                curveToRelative(-0.385f, 0.385f, -0.894f, 0.579f, -1.404f, 0.579f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-0.511f, -0.001f, -1.022f, -0.196f, -1.412f, -0.586f)
                lineToRelative(-4.286f, -4.2f)
                close()
                moveTo(23.0f, 16.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 22.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _insert!!
    }

private var _insert: ImageVector? = null
