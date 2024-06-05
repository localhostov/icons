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

public val Icons.Filled.Archway: ImageVector
    get() {
        if (_archway != null) {
            return _archway!!
        }
        _archway = Builder(name = "Archway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.337f, -2.014f, -4.212f, -4.399f, -3.981f)
                curveToRelative(-2.078f, 0.202f, -3.601f, 2.07f, -3.601f, 4.158f)
                verticalLineToRelative(5.822f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(1.586f, 6.0f)
                horizontalLineTo(22.414f)
                lineToRelative(0.885f, -0.884f)
                curveToRelative(0.692f, -0.692f, 0.896f, -1.724f, 0.522f, -2.627f)
                curveToRelative(-0.375f, -0.904f, -1.249f, -1.488f, -2.228f, -1.488f)
                horizontalLineTo(2.406f)
                curveTo(1.428f, 1.0f, 0.554f, 1.584f, 0.179f, 2.488f)
                curveTo(-0.195f, 3.392f, 0.009f, 4.423f, 0.701f, 5.116f)
                lineToRelative(0.885f, 0.884f)
                close()
            }
        }
        .build()
        return _archway!!
    }

private var _archway: ImageVector? = null
