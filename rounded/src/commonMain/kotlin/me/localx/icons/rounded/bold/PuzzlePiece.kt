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

public val Icons.Bold.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.842f, 12.0f)
                curveToRelative(-0.212f, 0.0f, -1.872f, 0.3f, -2.842f, 0.476f)
                verticalLineTo(11.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 12.5f, 6.0f)
                horizontalLineToRelative(-0.977f)
                curveTo(11.7f, 5.027f, 12.0f, 3.367f, 12.0f, 3.158f)
                arcTo(2.949f, 2.949f, 0.0f, false, false, 9.0f, 0.0f)
                arcTo(2.949f, 2.949f, 0.0f, false, false, 6.0f, 3.158f)
                curveTo(6.0f, 3.37f, 6.3f, 5.03f, 6.476f, 6.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 11.5f)
                verticalLineToRelative(7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.0f, 18.5f)
                verticalLineToRelative(-0.977f)
                curveToRelative(0.973f, 0.174f, 2.633f, 0.477f, 2.842f, 0.477f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                close()
                moveTo(15.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.5f, 21.0f)
                horizontalLineToRelative(-0.977f)
                curveToRelative(0.174f, -0.973f, 0.477f, -2.633f, 0.477f, -2.842f)
                arcTo(2.949f, 2.949f, 0.0f, false, false, 9.0f, 15.0f)
                arcToRelative(2.949f, 2.949f, 0.0f, false, false, -3.0f, 3.158f)
                curveToRelative(0.0f, 0.212f, 0.3f, 1.872f, 0.476f, 2.842f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 9.0f)
                horizontalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 11.5f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
