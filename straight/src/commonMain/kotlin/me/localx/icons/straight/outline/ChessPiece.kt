package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.ChessPiece: ImageVector
    get() {
        if (_chessPiece != null) {
            return _chessPiece!!
        }
        _chessPiece = Builder(name = "ChessPiece", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0251f, 22.0259f)
                    verticalLineTo(18.5449f)
                    lineTo(18.6501f, 18.2449f)
                    curveTo(16.1001f, 16.1999f, 15.1001f, 13.9369f, 15.0381f, 10.0259f)
                    horizontalLineTo(17.0251f)
                    verticalLineTo(8.0259f)
                    horizontalLineTo(15.4691f)
                    curveTo(15.8295f, 7.4208f, 16.0215f, 6.7302f, 16.0251f, 6.0259f)
                    curveTo(16.0251f, 4.7509f, 14.9341f, 2.9029f, 13.7181f, 0.9609f)
                    curveTo(13.538f, 0.6748f, 13.2883f, 0.439f, 12.9923f, 0.2756f)
                    curveTo(12.6963f, 0.1122f, 12.3637f, 0.0265f, 12.0256f, 0.0265f)
                    curveTo(11.6875f, 0.0265f, 11.355f, 0.1122f, 11.059f, 0.2756f)
                    curveTo(10.763f, 0.439f, 10.5133f, 0.6748f, 10.3331f, 0.9609f)
                    curveTo(9.1172f, 2.8999f, 8.0261f, 4.7509f, 8.0261f, 6.0259f)
                    curveTo(8.0303f, 6.7302f, 8.2222f, 7.4206f, 8.5822f, 8.0259f)
                    horizontalLineTo(7.0262f)
                    verticalLineTo(10.0259f)
                    horizontalLineTo(9.0132f)
                    curveTo(8.9481f, 13.9369f, 7.9542f, 16.1999f, 5.4001f, 18.2449f)
                    lineTo(5.0251f, 18.5449f)
                    verticalLineTo(22.0259f)
                    horizontalLineTo(3.0252f)
                    verticalLineTo(24.0259f)
                    horizontalLineTo(21.0251f)
                    verticalLineTo(22.0259f)
                    horizontalLineTo(19.0251f)
                    close()
                    moveTo(10.0251f, 6.0259f)
                    curveTo(10.0251f, 5.2199f, 11.4251f, 2.9789f, 12.0251f, 2.0259f)
                    curveTo(12.6251f, 2.9819f, 14.0251f, 5.2259f, 14.0251f, 6.0259f)
                    curveTo(14.0251f, 6.5564f, 13.8144f, 7.0651f, 13.4394f, 7.4401f)
                    curveTo(13.0643f, 7.8152f, 12.5556f, 8.0259f, 12.0251f, 8.0259f)
                    curveTo(11.4947f, 8.0259f, 10.986f, 7.8152f, 10.6109f, 7.4401f)
                    curveTo(10.2359f, 7.0651f, 10.0251f, 6.5564f, 10.0251f, 6.0259f)
                    close()
                    moveTo(13.0251f, 10.0259f)
                    curveTo(13.0661f, 13.0649f, 13.5901f, 15.6749f, 15.5601f, 18.0259f)
                    horizontalLineTo(8.4861f)
                    curveTo(10.4561f, 15.6749f, 10.9801f, 13.0649f, 11.0211f, 10.0259f)
                    horizontalLineTo(13.0251f)
                    close()
                    moveTo(7.0251f, 20.0259f)
                    horizontalLineTo(17.0251f)
                    verticalLineTo(22.0259f)
                    horizontalLineTo(7.0251f)
                    verticalLineTo(20.0259f)
                    close()
                }
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
