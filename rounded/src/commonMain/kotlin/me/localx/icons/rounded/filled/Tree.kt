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

public val Icons.Filled.Tree: ImageVector
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
                reflectiveCurveTo(5.473f, 6.1f, 5.451f, 6.13f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 5.0f, 7.6f)
                arcTo(1.409f, 1.409f, 0.0f, false, false, 6.41f, 9.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(5.206f)
                reflectiveCurveToRelative(-0.707f, 0.784f, -0.732f, 0.82f)
                arcTo(2.936f, 2.936f, 0.0f, false, false, 4.0f, 13.385f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, false, 0.091f, 0.522f)
                arcTo(1.84f, 1.84f, 0.0f, false, false, 5.834f, 15.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(3.782f)
                reflectiveCurveToRelative(-0.228f, 0.268f, -0.249f, 0.3f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, 0.6f, 4.058f)
                arcTo(2.881f, 2.881f, 0.0f, false, false, 5.99f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(5.01f)
                arcToRelative(2.883f, 2.883f, 0.0f, false, false, 1.862f, -0.644f)
                arcTo(3.019f, 3.019f, 0.0f, false, false, 20.467f, 17.3f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
