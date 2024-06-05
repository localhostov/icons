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

public val Icons.Filled.BallotCheck: ImageVector
    get() {
        if (_ballotCheck != null) {
            return _ballotCheck!!
        }
        _ballotCheck = Builder(name = "BallotCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.962f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.631f, 14.0f)
                curveToRelative(-0.427f, 0.0f, -0.855f, -0.162f, -1.181f, -0.488f)
                lineToRelative(-1.45f, -1.393f)
                lineToRelative(1.386f, -1.442f)
                lineToRelative(1.241f, 1.192f)
                lineToRelative(2.533f, -2.48f)
                lineToRelative(1.399f, 1.429f)
                lineToRelative(-2.759f, 2.702f)
                curveToRelative(-0.32f, 0.32f, -0.744f, 0.481f, -1.168f, 0.481f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(-8.038f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.038f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-6.038f)
                lineToRelative(2.042f, -2.0f)
                horizontalLineToRelative(3.996f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 7.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _ballotCheck!!
    }

private var _ballotCheck: ImageVector? = null
