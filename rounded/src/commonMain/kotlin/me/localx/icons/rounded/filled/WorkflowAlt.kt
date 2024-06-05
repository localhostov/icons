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

public val Icons.Filled.WorkflowAlt: ImageVector
    get() {
        if (_workflowAlt != null) {
            return _workflowAlt!!
        }
        _workflowAlt = Builder(name = "WorkflowAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 15.121f)
                verticalLineToRelative(-6.357f)
                curveToRelative(0.392f, -0.142f, 0.762f, -0.361f, 1.076f, -0.675f)
                lineToRelative(1.564f, -1.564f)
                curveToRelative(1.145f, -1.145f, 1.145f, -3.008f, 0.0f, -4.152f)
                lineToRelative(-1.564f, -1.564f)
                curveToRelative(-1.145f, -1.144f, -3.006f, -1.145f, -4.152f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.563f, 1.565f, -1.563f, 1.565f)
                curveToRelative(-0.314f, 0.314f, -0.533f, 0.684f, -0.675f, 1.076f)
                horizontalLineToRelative(-6.322f)
                curveTo(8.387f, 1.475f, 6.618f, 0.0f, 4.5f, 0.0f)
                curveTo(2.019f, 0.0f, 0.0f, 2.018f, 0.0f, 4.5f)
                curveToRelative(0.0f, 1.953f, 1.258f, 3.602f, 3.0f, 4.224f)
                verticalLineToRelative(7.277f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-1.544f, 0.0f, -2.8f, 1.256f, -2.8f, 2.8f)
                verticalLineToRelative(2.399f)
                curveToRelative(0.0f, 1.544f, 1.256f, 2.801f, 2.8f, 2.801f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.544f, 0.0f, 2.8f, -1.257f, 2.8f, -2.801f)
                verticalLineToRelative(-2.399f)
                curveToRelative(0.0f, -1.544f, -1.256f, -2.8f, -2.8f, -2.8f)
                horizontalLineToRelative(-0.2f)
                verticalLineToRelative(-7.051f)
                curveToRelative(1.927f, -0.217f, 3.492f, -1.635f, 3.895f, -3.501f)
                horizontalLineToRelative(6.29f)
                curveToRelative(0.142f, 0.392f, 0.361f, 0.762f, 0.675f, 1.076f)
                lineToRelative(1.563f, 1.564f)
                curveToRelative(0.314f, 0.313f, 0.684f, 0.533f, 1.076f, 0.674f)
                verticalLineToRelative(6.358f)
                curveToRelative(-2.0f, 0.457f, -3.5f, 2.242f, -3.5f, 4.379f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -2.137f, -1.5f, -3.922f, -3.5f, -4.379f)
                close()
            }
        }
        .build()
        return _workflowAlt!!
    }

private var _workflowAlt: ImageVector? = null
