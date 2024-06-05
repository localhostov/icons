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

public val Icons.Filled.FilterSlash: ImageVector
    get() {
        if (_filterSlash != null) {
            return _filterSlash!!
        }
        _filterSlash = Builder(name = "FilterSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 22.293f)
                lineToRelative(-7.414f, -7.414f)
                lineToRelative(4.345f, -4.478f)
                curveToRelative(0.903f, -0.93f, 1.4f, -2.155f, 1.4f, -3.451f)
                curveToRelative(0.0f, -2.73f, -2.221f, -4.951f, -4.951f, -4.951f)
                lineTo(6.951f, 1.999f)
                curveToRelative(-0.973f, 0.0f, -1.909f, 0.297f, -2.712f, 0.825f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(15.0f, 19.242f)
                verticalLineToRelative(3.758f)
                curveToRelative(0.0f, 0.379f, -0.214f, 0.725f, -0.553f, 0.895f)
                curveToRelative(-0.142f, 0.071f, -0.295f, 0.105f, -0.447f, 0.105f)
                curveToRelative(-0.212f, 0.0f, -0.423f, -0.068f, -0.6f, -0.2f)
                lineToRelative(-4.0f, -3.0f)
                curveToRelative(-0.252f, -0.188f, -0.4f, -0.485f, -0.4f, -0.8f)
                verticalLineToRelative(-3.844f)
                lineTo(3.362f, 10.401f)
                curveToRelative(-0.903f, -0.93f, -1.4f, -2.155f, -1.4f, -3.451f)
                curveToRelative(0.0f, -0.235f, 0.028f, -0.462f, 0.06f, -0.687f)
                lineToRelative(12.978f, 12.978f)
                close()
            }
        }
        .build()
        return _filterSlash!!
    }

private var _filterSlash: ImageVector? = null
