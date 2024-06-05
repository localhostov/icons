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

public val Icons.Outline.RulesAlt: ImageVector
    get() {
        if (_rulesAlt != null) {
            return _rulesAlt!!
        }
        _rulesAlt = Builder(name = "RulesAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(17.0f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-12.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, 0.072f, -1.0f, 0.184f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(13.141f, 8.26f)
                lineToRelative(-2.037f, -2.152f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(1.496f, 1.582f)
                lineToRelative(2.543f, -2.631f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.113f, 3.221f)
                curveToRelative(-0.459f, 0.474f, -1.22f, 0.471f, -1.674f, -0.007f)
                close()
                moveTo(12.586f, 13.0f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.793f, -1.793f)
                close()
            }
        }
        .build()
        return _rulesAlt!!
    }

private var _rulesAlt: ImageVector? = null
