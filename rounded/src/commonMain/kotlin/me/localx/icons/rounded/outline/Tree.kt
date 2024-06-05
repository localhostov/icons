package me.localx.icons.rounded.outline

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

public val Icons.Outline.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.467f, 17.3f)
                curveToRelative(-0.021f, -0.03f, -1.557f, -1.815f, -1.557f, -1.815f)
                arcToRelative(2.67f, 2.67f, 0.0f, false, false, 0.616f, -3.663f)
                curveToRelative(-0.025f, -0.036f, -1.885f, -2.091f, -1.885f, -2.091f)
                arcToRelative(2.475f, 2.475f, 0.0f, false, false, 1.084f, -1.073f)
                arcToRelative(2.428f, 2.428f, 0.0f, false, false, -0.176f, -2.526f)
                curveTo(18.528f, 6.1f, 13.886f, 0.846f, 13.886f, 0.846f)
                arcToRelative(2.608f, 2.608f, 0.0f, false, false, -3.771f, 0.0f)
                reflectiveCurveTo(5.472f, 6.1f, 5.451f, 6.13f)
                arcToRelative(2.428f, 2.428f, 0.0f, false, false, -0.176f, 2.526f)
                arcTo(2.475f, 2.475f, 0.0f, false, false, 6.359f, 9.729f)
                reflectiveCurveTo(4.5f, 11.784f, 4.474f, 11.82f)
                arcToRelative(2.67f, 2.67f, 0.0f, false, false, 0.616f, 3.663f)
                reflectiveCurveTo(3.554f, 17.268f, 3.533f, 17.3f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.471f, -4.7f)
                close()
                moveTo(18.882f, 19.467f)
                arcTo(0.985f, 0.985f, 0.0f, false, true, 18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.85f, -1.529f)
                lineTo(7.285f, 16.0f)
                lineTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(6.67f, 14.0f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.578f, -1.0f)
                lineToRelative(2.722f, -3.0f)
                lineTo(12.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(7.5f, 8.0f)
                arcToRelative(0.488f, 0.488f, 0.0f, false, true, -0.451f, -0.264f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, 0.01f, -0.418f)
                lineToRelative(4.552f, -5.149f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, 0.773f, 0.0f)
                lineToRelative(4.55f, 5.148f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.011f, 0.418f)
                arcTo(0.488f, 0.488f, 0.0f, false, true, 16.5f, 8.0f)
                horizontalLineToRelative(-0.868f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.74f, 1.672f)
                lineTo(17.908f, 13.0f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.578f, 1.0f)
                horizontalLineToRelative(-0.157f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -0.757f, 1.653f)
                lineToRelative(2.43f, 2.818f)
                arcTo(0.979f, 0.979f, 0.0f, false, true, 18.882f, 19.465f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
