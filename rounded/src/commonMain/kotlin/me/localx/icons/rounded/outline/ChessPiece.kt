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
                moveToRelative(20.025f, 22.026f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.655f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, -1.225f, -2.871f)
                curveToRelative(-1.924f, -1.859f, -2.709f, -3.989f, -2.766f, -7.476f)
                horizontalLineToRelative(0.988f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.556f)
                arcToRelative(3.949f, 3.949f, 0.0f, false, false, 0.556f, -2.0f)
                curveToRelative(0.0f, -1.375f, -1.162f, -3.717f, -1.893f, -4.87f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.212f, 0.0f)
                curveToRelative(-0.732f, 1.154f, -1.894f, 3.5f, -1.894f, 4.871f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, 0.556f, 2.0f)
                horizontalLineToRelative(-0.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.989f)
                curveToRelative(-0.058f, 3.487f, -0.844f, 5.616f, -2.766f, 7.475f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, false, -1.223f, 2.87f)
                verticalLineToRelative(1.655f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(11.608f, 2.226f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.835f, 0.0f)
                arcToRelative(10.752f, 10.752f, 0.0f, false, true, 1.582f, 3.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(10.763f, 10.763f, 0.0f, false, true, 1.583f, -3.799f)
                close()
                moveTo(13.038f, 10.026f)
                curveToRelative(0.054f, 3.516f, 0.8f, 5.951f, 2.522f, 8.0f)
                horizontalLineToRelative(-7.069f)
                curveToRelative(1.72f, -2.049f, 2.468f, -4.485f, 2.523f, -8.0f)
                close()
                moveTo(7.026f, 20.371f)
                arcToRelative(1.905f, 1.905f, 0.0f, false, true, 0.036f, -0.345f)
                horizontalLineToRelative(9.928f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.035f, 0.345f)
                verticalLineToRelative(1.655f)
                horizontalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
