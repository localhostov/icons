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

public val Icons.Bold.ChessPiece: ImageVector
    get() {
        if (_chessPiece != null) {
            return _chessPiece!!
        }
        _chessPiece = Builder(name = "ChessPiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.655f)
                arcToRelative(4.515f, 4.515f, 0.0f, false, false, -1.376f, -3.229f)
                arcToRelative(8.361f, 8.361f, 0.0f, false, true, -2.557f, -6.116f)
                horizontalLineToRelative(0.933f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-0.722f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, 0.747f, -2.312f)
                arcToRelative(10.541f, 10.541f, 0.0f, false, false, -1.681f, -4.416f)
                arcToRelative(2.734f, 2.734f, 0.0f, false, false, -2.318f, -1.272f)
                arcToRelative(2.731f, 2.731f, 0.0f, false, false, -2.318f, 1.272f)
                arcToRelative(10.523f, 10.523f, 0.0f, false, false, -1.682f, 4.416f)
                arcToRelative(3.964f, 3.964f, 0.0f, false, false, 0.748f, 2.312f)
                horizontalLineToRelative(-0.274f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(0.457f)
                arcToRelative(8.378f, 8.378f, 0.0f, false, true, -2.582f, 6.116f)
                arcToRelative(4.518f, 4.518f, 0.0f, false, false, -1.375f, 3.229f)
                verticalLineToRelative(0.655f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(12.058f, 11.0f)
                arcToRelative(11.586f, 11.586f, 0.0f, false, false, 3.216f, 8.0f)
                horizontalLineToRelative(-6.548f)
                arcToRelative(11.583f, 11.583f, 0.0f, false, false, 3.24f, -8.0f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
