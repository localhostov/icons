package me.localx.icons.straight.filled

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

public val Icons.Filled.CurveArrow: ImageVector
    get() {
        if (_curveArrow != null) {
            return _curveArrow!!
        }
        _curveArrow = Builder(name = "CurveArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.772f, 20.55f)
                lineToRelative(-2.772f, 2.95f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.5f)
                lineTo(3.45f, 0.228f)
                curveToRelative(0.304f, -0.304f, 0.796f, -0.304f, 1.1f, 0.0f)
                lineToRelative(2.95f, 2.772f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(14.54f)
                curveToRelative(0.8f, -1.345f, 1.785f, -3.313f, 2.205f, -4.8f)
                curveToRelative(1.531f, -5.419f, 2.582f, -8.74f, 4.795f, -8.74f)
                curveToRelative(1.843f, 0.0f, 2.881f, 2.32f, 4.06f, 6.219f)
                curveToRelative(-0.4f, -0.138f, -0.833f, -0.219f, -1.31f, -0.219f)
                curveToRelative(-2.77f, 0.0f, -4.149f, 2.592f, -5.26f, 4.677f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.331f, 0.623f, -1.114f, 1.941f, -1.399f, 2.323f)
                curveToRelative(-0.77f, 1.154f, -1.591f, 2.0f, -1.591f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.956f, 0.0f, 1.954f, -1.876f, 2.756f, -3.383f)
                curveToRelative(0.99f, -1.86f, 1.925f, -3.617f, 3.494f, -3.617f)
                reflectiveCurveToRelative(2.504f, 1.757f, 3.494f, 3.617f)
                curveToRelative(0.802f, 1.507f, 1.8f, 3.383f, 2.756f, 3.383f)
                verticalLineToRelative(-2.5f)
                lineToRelative(2.772f, 2.95f)
                curveToRelative(0.304f, 0.304f, 0.304f, 0.796f, 0.0f, 1.1f)
                close()
            }
        }
        .build()
        return _curveArrow!!
    }

private var _curveArrow: ImageVector? = null
