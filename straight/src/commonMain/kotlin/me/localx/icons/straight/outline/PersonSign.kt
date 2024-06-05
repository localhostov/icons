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

public val Icons.Outline.PersonSign: ImageVector
    get() {
        if (_personSign != null) {
            return _personSign!!
        }
        _personSign = Builder(name = "PersonSign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(-1.8f, -2.4f)
                curveToRelative(-0.753f, -1.001f, -1.949f, -1.6f, -3.2f, -1.6f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.001f)
                lineToRelative(-1.499f, -1.999f)
                horizontalLineToRelative(-0.501f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.626f, 0.0f, 1.225f, 0.299f, 1.601f, 0.8f)
                lineToRelative(2.399f, 3.2f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3.5f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(22.0f, 5.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(4.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _personSign!!
    }

private var _personSign: ImageVector? = null
