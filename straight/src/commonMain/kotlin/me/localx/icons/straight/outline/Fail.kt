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

public val Icons.Outline.Fail: ImageVector
    get() {
        if (_fail != null) {
            return _fail!!
        }
        _fail = Builder(name = "Fail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(18.6f, 8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(12.161f, 9.627f)
                lineToRelative(1.339f, 6.373f)
                horizontalLineToRelative(-1.632f)
                lineToRelative(-0.295f, -1.4f)
                horizontalLineToRelative(-2.379f)
                lineToRelative(-0.309f, 1.4f)
                horizontalLineToRelative(-1.584f)
                lineToRelative(1.365f, -6.418f)
                curveToRelative(0.116f, -0.58f, 0.455f, -1.079f, 0.926f, -1.356f)
                curveToRelative(0.255f, -0.15f, 0.535f, -0.225f, 0.816f, -0.225f)
                curveToRelative(0.242f, 0.0f, 0.486f, 0.056f, 0.718f, 0.168f)
                curveToRelative(0.512f, 0.246f, 0.9f, 0.791f, 1.035f, 1.459f)
                close()
                moveTo(11.237f, 13.0f)
                lineToRelative(-0.641f, -3.044f)
                curveToRelative(-0.047f, -0.231f, -0.144f, -0.334f, -0.168f, -0.349f)
                lineToRelative(-0.017f, -0.006f)
                curveToRelative(-0.071f, 0.042f, -0.146f, 0.146f, -0.176f, 0.296f)
                lineToRelative(-0.686f, 3.104f)
                horizontalLineToRelative(1.688f)
                close()
                moveTo(24.001f, 6.0f)
                verticalLineToRelative(15.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.001f, 6.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 6.0f)
                close()
            }
        }
        .build()
        return _fail!!
    }

private var _fail: ImageVector? = null
