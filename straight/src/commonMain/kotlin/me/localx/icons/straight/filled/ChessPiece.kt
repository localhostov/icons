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

public val Icons.Filled.ChessPiece: ImageVector
    get() {
        if (_chessPiece != null) {
            return _chessPiece!!
        }
        _chessPiece = Builder(name = "ChessPiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.026f, 5.0f)
                curveToRelative(0.0f, -1.077f, 1.267f, -3.117f, 2.154f, -4.533f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.691f, 0.0f)
                curveToRelative(0.887f, 1.416f, 2.155f, 3.456f, 2.155f, 4.533f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                close()
                moveTo(19.026f, 22.026f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.039f, 10.026f)
                horizontalLineToRelative(1.987f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.987f)
                curveToRelative(-0.064f, 3.773f, -1.005f, 6.013f, -3.363f, 8.0f)
                horizontalLineToRelative(12.75f)
                curveToRelative(-2.357f, -1.987f, -3.3f, -4.226f, -3.362f, -8.0f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
