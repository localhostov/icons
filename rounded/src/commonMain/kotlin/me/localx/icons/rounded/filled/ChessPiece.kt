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
                moveToRelative(15.0f, 5.026f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, true, 1.739f, -4.335f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.522f, 0.0f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, true, 1.739f, 4.335f)
                close()
                moveTo(5.8f, 18.0f)
                horizontalLineToRelative(12.4f)
                arcToRelative(3.906f, 3.906f, 0.0f, false, false, -0.421f, -0.5f)
                curveToRelative(-1.923f, -1.859f, -2.708f, -4.015f, -2.766f, -7.5f)
                horizontalLineToRelative(0.987f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.989f)
                curveToRelative(-0.058f, 3.487f, -0.843f, 5.643f, -2.766f, 7.5f)
                arcToRelative(4.073f, 4.073f, 0.0f, false, false, -0.423f, 0.5f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.629f)
                curveToRelative(0.0f, -0.125f, -0.026f, -0.247f, -0.038f, -0.371f)
                horizontalLineToRelative(-13.924f)
                curveToRelative(-0.012f, 0.124f, -0.038f, 0.246f, -0.038f, 0.371f)
                verticalLineToRelative(1.629f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
