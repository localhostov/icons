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

public val Icons.Outline.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -1.021f, -1.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(10.731f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 9.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 1.731f)
                verticalLineToRelative(7.444f)
                arcTo(2.936f, 2.936f, 0.0f, false, true, 24.0f, 21.0f)
                close()
                moveTo(14.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.766f, -5.9f)
                arcTo(41.973f, 41.973f, 0.0f, false, false, 3.974f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.7f, -1.691f)
                reflectiveCurveTo(2.27f, 5.748f, 2.25f, 5.707f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 4.6f, 2.0f)
                horizontalLineTo(6.01f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.4f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.352f, 3.707f)
                curveToRelative(-0.019f, 0.041f, -1.029f, 1.6f, -1.029f, 1.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.027f, 9.0f)
                arcToRelative(42.376f, 42.376f, 0.0f, false, false, 1.74f, 9.1f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.0f, 21.0f)
                close()
                moveTo(5.976f, 9.0f)
                arcToRelative(41.982f, 41.982f, 0.0f, false, true, -1.625f, 9.0f)
                horizontalLineToRelative(5.3f)
                arcTo(42.235f, 42.235f, 0.0f, false, true, 8.025f, 9.0f)
                close()
                moveTo(4.04f, 4.807f)
                lineToRelative(1.4f, 2.16f)
                lineTo(5.461f, 7.0f)
                horizontalLineToRelative(3.08f)
                lineToRelative(0.02f, -0.033f)
                lineToRelative(1.4f, -2.16f)
                arcTo(0.6f, 0.6f, 0.0f, false, false, 9.4f, 4.0f)
                horizontalLineTo(4.6f)
                arcToRelative(0.588f, 0.588f, 0.0f, false, false, -0.506f, 0.278f)
                arcTo(0.594f, 0.594f, 0.0f, false, false, 4.04f, 4.807f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
