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

public val Icons.Outline.SquareRoot: ImageVector
    get() {
        if (_squareRoot != null) {
            return _squareRoot!!
        }
        _squareRoot = Builder(name = "SquareRoot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.04f, 4.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -2.891f, 2.2f)
                lineToRelative(-4.049f, 14.568f)
                arcToRelative(1.678f, 1.678f, 0.0f, false, true, -1.6f, 1.232f)
                arcToRelative(1.747f, 1.747f, 0.0f, false, true, -1.622f, -1.159f)
                lineToRelative(-2.793f, -7.68f)
                arcToRelative(3.461f, 3.461f, 0.0f, false, false, -2.312f, -2.189f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.471f, -1.944f)
                arcToRelative(5.434f, 5.434f, 0.0f, false, true, 3.721f, 3.45f)
                lineToRelative(2.474f, 6.8f)
                lineToRelative(3.784f, -13.616f)
                arcToRelative(5.015f, 5.015f, 0.0f, false, true, 4.817f, -3.662f)
                horizontalLineToRelative(6.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(23.6f, 12.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.2f)
                lineToRelative(-2.2f, 2.933f)
                lineToRelative(-2.2f, -2.933f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.6f, 1.2f)
                lineToRelative(2.55f, 3.4f)
                lineToRelative(-2.55f, 3.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.6f, 1.2f)
                lineToRelative(2.2f, -2.933f)
                lineToRelative(2.2f, 2.933f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.6f, -1.2f)
                lineToRelative(-2.55f, -3.4f)
                lineToRelative(2.55f, -3.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.2f, -1.4f)
                close()
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
