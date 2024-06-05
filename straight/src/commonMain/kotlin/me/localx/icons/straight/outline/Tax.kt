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

public val Icons.Outline.Tax: ImageVector
    get() {
        if (_tax != null) {
            return _tax!!
        }
        _tax = Builder(name = "Tax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.414f)
                lineTo(12.414f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(13.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(-3.586f)
                close()
                moveTo(12.136f, 18.6f)
                horizontalLineToRelative(2.829f)
                lineToRelative(0.325f, 1.4f)
                horizontalLineToRelative(1.609f)
                lineToRelative(-1.447f, -6.373f)
                curveToRelative(-0.146f, -0.668f, -0.565f, -1.213f, -1.118f, -1.459f)
                curveToRelative(-0.251f, -0.112f, -0.514f, -0.168f, -0.776f, -0.168f)
                curveToRelative(-0.305f, 0.0f, -0.607f, 0.075f, -0.882f, 0.225f)
                curveToRelative(-0.509f, 0.277f, -0.875f, 0.776f, -1.001f, 1.356f)
                lineToRelative(-1.475f, 6.418f)
                horizontalLineToRelative(1.607f)
                lineToRelative(0.33f, -1.4f)
                close()
                moveTo(13.238f, 13.921f)
                curveToRelative(0.028f, -0.128f, 0.104f, -0.237f, 0.201f, -0.29f)
                curveToRelative(0.038f, -0.021f, 0.077f, -0.031f, 0.118f, -0.031f)
                curveToRelative(0.04f, 0.0f, 0.081f, 0.01f, 0.127f, 0.03f)
                curveToRelative(0.056f, 0.025f, 0.161f, 0.139f, 0.207f, 0.351f)
                lineToRelative(0.701f, 3.019f)
                horizontalLineToRelative(-2.081f)
                lineToRelative(0.726f, -3.079f)
                close()
                moveTo(6.699f, 20.0f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(21.005f, 16.0f)
                lineToRelative(1.994f, 4.0f)
                horizontalLineToRelative(-1.812f)
                lineToRelative(-1.088f, -2.182f)
                lineToRelative(-1.088f, 2.182f)
                horizontalLineToRelative(-1.812f)
                lineToRelative(1.994f, -4.0f)
                lineToRelative(-1.994f, -4.0f)
                horizontalLineToRelative(1.812f)
                lineToRelative(1.088f, 2.182f)
                lineToRelative(1.088f, -2.182f)
                horizontalLineToRelative(1.812f)
                lineToRelative(-1.994f, 4.0f)
                close()
            }
        }
        .build()
        return _tax!!
    }

private var _tax: ImageVector? = null
