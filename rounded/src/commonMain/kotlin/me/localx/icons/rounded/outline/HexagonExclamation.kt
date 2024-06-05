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

public val Icons.Outline.HexagonExclamation: ImageVector
    get() {
        if (_hexagonExclamation != null) {
            return _hexagonExclamation!!
        }
        _hexagonExclamation = Builder(name = "HexagonExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.34f, 9.48f)
                lineToRelative(-3.5f, -6.0f)
                curveToRelative(-0.893f, -1.53f, -2.547f, -2.48f, -4.319f, -2.48f)
                horizontalLineToRelative(-7.072f)
                curveToRelative(-1.771f, 0.0f, -3.426f, 0.95f, -4.319f, 2.48f)
                lineTo(0.631f, 9.48f)
                curveToRelative(-0.907f, 1.554f, -0.907f, 3.485f, 0.0f, 5.039f)
                lineToRelative(3.5f, 6.0f)
                curveToRelative(0.893f, 1.53f, 2.547f, 2.48f, 4.319f, 2.48f)
                horizontalLineToRelative(7.072f)
                curveToRelative(1.771f, 0.0f, 3.426f, -0.95f, 4.319f, -2.48f)
                lineToRelative(3.5f, -6.0f)
                curveToRelative(0.907f, -1.554f, 0.907f, -3.485f, 0.0f, -5.039f)
                close()
                moveTo(21.612f, 13.511f)
                lineToRelative(-3.5f, 6.0f)
                curveToRelative(-0.536f, 0.918f, -1.528f, 1.488f, -2.591f, 1.488f)
                horizontalLineToRelative(-7.072f)
                curveToRelative(-1.063f, 0.0f, -2.056f, -0.57f, -2.591f, -1.488f)
                lineToRelative(-3.5f, -6.0f)
                curveToRelative(-0.544f, -0.933f, -0.544f, -2.091f, 0.0f, -3.023f)
                lineToRelative(3.5f, -6.0f)
                curveToRelative(0.536f, -0.918f, 1.528f, -1.488f, 2.591f, -1.488f)
                horizontalLineToRelative(7.072f)
                curveToRelative(1.063f, 0.0f, 2.056f, 0.57f, 2.591f, 1.488f)
                lineToRelative(3.5f, 6.0f)
                curveToRelative(0.544f, 0.933f, 0.544f, 2.091f, 0.0f, 3.023f)
                close()
                moveTo(10.999f, 12.499f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(13.499f, 16.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hexagonExclamation!!
    }

private var _hexagonExclamation: ImageVector? = null
