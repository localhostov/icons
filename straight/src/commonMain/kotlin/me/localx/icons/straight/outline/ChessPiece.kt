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

public val Icons.Outline.ChessPiece: ImageVector
    get() {
        if (_chessPiece != null) {
            return _chessPiece!!
        }
        _chessPiece = Builder(name = "ChessPiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.025f, 22.026f)
                verticalLineToRelative(-3.481f)
                lineToRelative(-0.375f, -0.3f)
                curveToRelative(-2.55f, -2.045f, -3.55f, -4.308f, -3.612f, -8.219f)
                horizontalLineToRelative(1.987f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.556f)
                arcToRelative(3.949f, 3.949f, 0.0f, false, false, 0.556f, -2.0f)
                curveToRelative(0.0f, -1.275f, -1.091f, -3.123f, -2.307f, -5.065f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.385f, 0.0f)
                curveToRelative(-1.216f, 1.939f, -2.307f, 3.79f, -2.307f, 5.065f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, 0.556f, 2.0f)
                horizontalLineToRelative(-1.556f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.987f)
                curveToRelative(-0.065f, 3.911f, -1.059f, 6.174f, -3.613f, 8.219f)
                lineToRelative(-0.375f, 0.3f)
                verticalLineToRelative(3.481f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.025f, 6.026f)
                curveToRelative(0.0f, -0.806f, 1.4f, -3.047f, 2.0f, -4.0f)
                curveToRelative(0.6f, 0.956f, 2.0f, 3.2f, 2.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                close()
                moveTo(13.025f, 10.026f)
                curveToRelative(0.041f, 3.039f, 0.565f, 5.649f, 2.535f, 8.0f)
                horizontalLineToRelative(-7.074f)
                curveToRelative(1.97f, -2.351f, 2.494f, -4.961f, 2.535f, -8.0f)
                close()
                moveTo(7.025f, 20.026f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
