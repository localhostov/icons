package me.localx.icons.rounded.bold

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

public val Icons.Bold.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 16.67f)
                lineToRelative(-0.015f, -0.021f)
                lineToRelative(-1.115f, -1.56f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.468f, -0.641f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, -0.271f, -3.018f)
                lineTo(17.941f, 9.36f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.75f, -0.91f)
                arcToRelative(2.746f, 2.746f, 0.0f, false, false, -0.219f, -2.894f)
                curveTo(18.432f, 5.5f, 14.2f, 0.989f, 14.2f, 0.989f)
                arcTo(2.97f, 2.97f, 0.0f, false, false, 9.827f, 0.956f)
                reflectiveCurveToRelative(-4.259f, 4.544f, -4.3f, 4.6f)
                arcTo(2.746f, 2.746f, 0.0f, false, false, 5.309f, 8.45f)
                arcToRelative(2.812f, 2.812f, 0.0f, false, false, 0.758f, 0.916f)
                lineToRelative(-1.529f, 2.1f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 4.312f, 14.4f)
                arcToRelative(2.849f, 2.849f, 0.0f, false, false, 0.5f, 0.678f)
                lineTo(3.6f, 16.67f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 6.4f, 22.0f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 22.0f)
                horizontalLineToRelative(4.1f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 2.8f, -5.33f)
                close()
                moveTo(17.955f, 18.786f)
                arcTo(0.38f, 0.38f, 0.0f, false, true, 17.6f, 19.0f)
                lineTo(6.4f, 19.0f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, -0.354f, -0.214f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, -0.014f, -0.359f)
                lineTo(7.873f, 16.0f)
                lineTo(11.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(7.133f, 13.0f)
                lineToRelative(2.183f, -3.0f)
                lineTo(10.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(8.266f, 7.0f)
                lineToRelative(3.719f, -3.99f)
                lineTo(15.731f, 7.0f)
                horizontalLineToRelative(-0.284f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.209f, 2.388f)
                lineTo(16.889f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.109f, 2.369f)
                lineToRelative(2.151f, 3.007f)
                arcTo(0.38f, 0.38f, 0.0f, false, true, 17.951f, 18.786f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
