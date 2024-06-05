package me.localx.icons.straight.bold

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
                moveToRelative(19.0f, 21.0f)
                verticalLineToRelative(-2.721f)
                lineToRelative(-0.562f, -0.45f)
                curveToRelative(-2.372f, -1.897f, -2.438f, -3.856f, -2.438f, -7.307f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.006f, -3.0f)
                horizontalLineToRelative(-2.455f)
                arcToRelative(3.944f, 3.944f, 0.0f, false, false, 0.477f, -1.854f)
                curveToRelative(0.0f, -1.244f, -0.917f, -2.808f, -2.023f, -4.573f)
                arcToRelative(2.332f, 2.332f, 0.0f, false, false, -3.952f, 0.0f)
                curveToRelative(-1.111f, 1.766f, -2.027f, 3.33f, -2.027f, 4.572f)
                arcToRelative(3.939f, 3.939f, 0.0f, false, false, 0.469f, 1.838f)
                lineToRelative(-2.495f, -0.005f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.463f, -0.069f, 5.429f, -2.438f, 7.325f)
                lineToRelative(-0.562f, 0.454f)
                verticalLineToRelative(2.721f)
                horizontalLineToRelative(-1.974f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 10.515f)
                curveToRelative(0.0f, 2.759f, 0.055f, 5.244f, 1.541f, 7.485f)
                horizontalLineToRelative(-5.082f)
                curveToRelative(1.484f, -2.239f, 1.541f, -4.727f, 1.541f, -7.489f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
