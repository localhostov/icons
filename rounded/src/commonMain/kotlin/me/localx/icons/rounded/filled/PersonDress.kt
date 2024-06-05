package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PersonDress: ImageVector
    get() {
        if (_personDress != null) {
            return _personDress!!
        }
        _personDress = Builder(name = "PersonDress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.728f, 12.314f)
                reflectiveCurveToRelative(-4.731f, -5.003f, -4.749f, -5.02f)
                curveToRelative(-0.757f, -0.794f, -1.812f, -1.294f, -2.979f, -1.294f)
                curveToRelative(-1.311f, 0.0f, -2.493f, 0.619f, -3.255f, 1.593f)
                lineToRelative(-4.471f, 4.719f)
                curveToRelative(-0.38f, 0.401f, -0.363f, 1.034f, 0.038f, 1.414f)
                curveToRelative(0.193f, 0.183f, 0.441f, 0.274f, 0.688f, 0.274f)
                curveToRelative(0.265f, 0.0f, 0.529f, -0.104f, 0.726f, -0.312f)
                lineToRelative(1.918f, -2.024f)
                lineToRelative(-0.621f, 4.964f)
                curveToRelative(-0.107f, 0.854f, 0.158f, 1.712f, 0.728f, 2.357f)
                curveToRelative(0.34f, 0.385f, 0.775f, 0.658f, 1.249f, 0.826f)
                verticalLineToRelative(3.188f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.188f)
                curveToRelative(0.474f, -0.169f, 0.909f, -0.441f, 1.249f, -0.826f)
                curveToRelative(0.569f, -0.645f, 0.834f, -1.504f, 0.728f, -2.357f)
                lineToRelative(-0.622f, -4.978f)
                lineToRelative(1.918f, 2.036f)
                curveToRelative(0.197f, 0.209f, 0.462f, 0.314f, 0.728f, 0.314f)
                curveToRelative(0.246f, 0.0f, 0.493f, -0.09f, 0.686f, -0.272f)
                curveToRelative(0.402f, -0.379f, 0.421f, -1.012f, 0.042f, -1.414f)
                close()
            }
        }
        .build()
        return _personDress!!
    }

private var _personDress: ImageVector? = null
