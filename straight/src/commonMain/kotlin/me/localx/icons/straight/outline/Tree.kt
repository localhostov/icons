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

public val Icons.Outline.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4f, 21.9997f)
                lineTo(18.266f, 15.9997f)
                horizontalLineTo(21.085f)
                lineTo(16.8f, 9.9997f)
                horizontalLineTo(19.955f)
                lineTo(14.055f, 1.0707f)
                curveTo(13.8213f, 0.7415f, 13.5118f, 0.4734f, 13.1526f, 0.289f)
                curveTo(12.7934f, 0.1046f, 12.3951f, 0.0094f, 11.9913f, 0.0113f)
                curveTo(11.5876f, 0.0133f, 11.1903f, 0.1124f, 10.8329f, 0.3002f)
                curveTo(10.4755f, 0.4881f, 10.1686f, 0.7592f, 9.938f, 1.0907f)
                lineTo(4.044f, 9.9997f)
                horizontalLineTo(7.2f)
                lineTo(2.912f, 15.9997f)
                horizontalLineTo(5.731f)
                lineTo(1.6f, 21.9997f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.9997f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.9997f)
                horizontalLineTo(22.4f)
                close()
                moveTo(8.16f, 15.9997f)
                horizontalLineTo(13.411f)
                lineTo(12.033f, 13.9997f)
                horizontalLineTo(6.8f)
                lineTo(9.658f, 9.9997f)
                horizontalLineTo(11.886f)
                lineTo(10.456f, 7.9997f)
                horizontalLineTo(7.765f)
                lineTo(11.589f, 2.2147f)
                curveTo(11.6323f, 2.1477f, 11.6912f, 2.0924f, 11.7607f, 2.0534f)
                curveTo(11.8301f, 2.0144f, 11.9081f, 1.993f, 11.9877f, 1.9911f)
                curveTo(12.0674f, 1.9891f, 12.1463f, 2.0066f, 12.2176f, 2.0421f)
                curveTo(12.289f, 2.0776f, 12.3506f, 2.13f, 12.397f, 2.1947f)
                lineTo(16.235f, 7.9997f)
                horizontalLineTo(12.914f)
                lineTo(17.2f, 13.9997f)
                horizontalLineTo(14.462f)
                lineTo(18.6f, 19.9997f)
                horizontalLineTo(5.4f)
                lineTo(8.16f, 15.9997f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
