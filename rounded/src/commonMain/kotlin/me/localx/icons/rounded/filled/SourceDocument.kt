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

public val Icons.Filled.SourceDocument: ImageVector
    get() {
        if (_sourceDocument != null) {
            return _sourceDocument!!
        }
        _sourceDocument = Builder(name = "SourceDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 19.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(7.0f, 11.0f)
                curveToRelative(0.215f, 0.0f, 0.431f, -0.068f, 0.613f, -0.211f)
                curveToRelative(0.436f, -0.339f, 0.515f, -0.967f, 0.176f, -1.403f)
                lineToRelative(-2.252f, -2.8f)
                curveToRelative(0.289f, -0.461f, 0.462f, -1.001f, 0.462f, -1.585f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(0.0f, 3.343f, 0.0f, 5.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.341f, 0.0f, 0.663f, -0.069f, 0.968f, -0.174f)
                lineToRelative(2.242f, 2.788f)
                curveToRelative(0.197f, 0.253f, 0.492f, 0.386f, 0.79f, 0.386f)
                close()
                moveTo(11.0f, 5.816f)
                verticalLineToRelative(3.184f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.184f)
                curveToRelative(1.163f, -0.413f, 2.0f, -1.512f, 2.0f, -2.816f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.837f, 2.403f, 2.0f, 2.816f)
                close()
                moveTo(21.0f, 2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.536f, 0.152f, 1.032f, 0.399f, 1.468f)
                lineToRelative(-2.188f, 2.918f)
                curveToRelative(-0.339f, 0.437f, -0.26f, 1.064f, 0.176f, 1.403f)
                curveToRelative(0.182f, 0.143f, 0.398f, 0.211f, 0.613f, 0.211f)
                curveToRelative(0.298f, 0.0f, 0.593f, -0.133f, 0.79f, -0.386f)
                lineToRelative(2.12f, -2.826f)
                curveToRelative(0.339f, 0.133f, 0.705f, 0.212f, 1.091f, 0.212f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _sourceDocument!!
    }

private var _sourceDocument: ImageVector? = null
