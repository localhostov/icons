package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Lesson: ImageVector
    get() {
        if (_lesson != null) {
            return _lesson!!
        }
        _lesson = Builder(name = "Lesson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.763f, 12.359f)
                lineToRelative(-5.763f, 3.641f)
                lineToRelative(3.0f, 1.895f)
                verticalLineToRelative(4.65f)
                reflectiveCurveToRelative(1.143f, 1.455f, 4.0f, 1.455f)
                reflectiveCurveToRelative(4.0f, -1.455f, 4.0f, -1.455f)
                verticalLineToRelative(-4.65f)
                lineToRelative(1.0f, -0.632f)
                verticalLineToRelative(4.736f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-5.763f, -3.641f)
                curveToRelative(-0.742f, -0.47f, -1.733f, -0.47f, -2.474f, 0.0f)
                close()
                moveTo(14.0f, 21.58f)
                curveToRelative(-0.389f, 0.202f, -1.034f, 0.42f, -2.0f, 0.42f)
                curveToRelative(-0.999f, 0.0f, -1.655f, -0.234f, -2.04f, -0.441f)
                lineToRelative(0.008f, -2.42f)
                lineToRelative(0.794f, 0.502f)
                curveToRelative(0.371f, 0.235f, 0.799f, 0.359f, 1.237f, 0.359f)
                reflectiveCurveToRelative(0.866f, -0.124f, 1.236f, -0.358f)
                lineToRelative(0.764f, -0.482f)
                verticalLineToRelative(2.421f)
                close()
                moveTo(12.168f, 17.951f)
                curveToRelative(-0.104f, 0.064f, -0.232f, 0.065f, -0.336f, 0.0f)
                lineToRelative(-3.087f, -1.95f)
                lineToRelative(3.088f, -1.951f)
                curveToRelative(0.104f, -0.064f, 0.232f, -0.065f, 0.336f, 0.0f)
                lineToRelative(3.087f, 1.95f)
                lineToRelative(-3.088f, 1.951f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 4.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _lesson!!
    }

private var _lesson: ImageVector? = null
