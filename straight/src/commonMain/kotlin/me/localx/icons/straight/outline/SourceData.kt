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

public val Icons.Outline.SourceData: ImageVector
    get() {
        if (_sourceData != null) {
            return _sourceData!!
        }
        _sourceData = Builder(name = "SourceData", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(7.793f, 14.655f)
                lineToRelative(2.881f, 2.881f)
                curveToRelative(0.366f, 0.365f, 0.846f, 0.549f, 1.326f, 0.549f)
                reflectiveCurveToRelative(0.96f, -0.184f, 1.326f, -0.549f)
                lineToRelative(2.881f, -2.881f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.793f, 1.792f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.034f)
                lineToRelative(-1.793f, -1.792f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 1.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                close()
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 0.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.5f, 7.0f)
                lineTo(2.083f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineToRelative(2.417f, 7.0f)
                horizontalLineToRelative(2.083f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.083f)
                lineToRelative(-2.417f, 7.0f)
                horizontalLineToRelative(2.083f)
                lineToRelative(2.417f, -7.0f)
                close()
            }
        }
        .build()
        return _sourceData!!
    }

private var _sourceData: ImageVector? = null
